// Code samples based on Chapter 5 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/27/2021

#include <vector>
#include <thread>
#include <string>
#include <cassert>
#include <utility>
#include <future>
#include <numeric>

using namespace std;

void increment(int* p) {
    *p = *p + 1;
}

void addLastName(string* p) {
    p->append(" Jarombek");
}

void threadSafeIncrement(mutex* m, int* p) {
    // Unlocked when the function completes.
    unique_lock<mutex> lock {*m};
    *p = *p + 1;
}

int acc(int* begin, int* end, int init) {
    return accumulate(begin, end, init);
}

int main() {
    int x = 0;
    string name = "Andy";

    thread t1 (increment, &x);
    thread t2 (addLastName, &name);

    assert(x == 0);
    assert(name == "Andy");

    t1.join();
    t2.join();

    assert(x == 1);
    assert(name == "Andy Jarombek");

    mutex m;

    thread t3 (threadSafeIncrement, &m, &x);
    thread t4 (threadSafeIncrement, &m, &x);

    t3.join();
    t4.join();

    assert(x == 3);

    struct Person {
        string name;

        explicit Person(string name) {
            this->name = move(name);
        }
    };

    // Objects allocated on the free store with 'new' must be explicitly deleted.
    Person* andy = new Person("Andy");
    assert(andy->name == "Andy");
    delete andy;

    // Alternatively, a unique_ptr can be used.
    unique_ptr<Person> andy2 {new Person("Andy")};
    assert(andy2->name == "Andy");

    // Simplifying asynchronous tasks/threads with 'async()'.
    vector<int> v = {1, 2, 3, 4, 5, 6};

    auto r1 = async(acc, &v[0], &v[0] + v.size() / 2, 0);
    auto r2 = async(acc, &v[0] + v.size() / 2, &v[0] + v.size(), 0);

    assert(r1.get() + r2.get() == 21);
}