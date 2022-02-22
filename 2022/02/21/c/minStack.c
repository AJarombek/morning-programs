// Program: https://leetcode.com/problems/min-stack/
// Author: Andrew Jarombek
// Date: 2/21/2022

#include <stdlib.h>
#include <assert.h>

typedef struct Node Node;

struct Node {
    int val;
    int min;
    Node* next;
};

typedef struct {
    Node* node;
} MinStack;


MinStack* minStackCreate() {
    MinStack* stack = (MinStack*) malloc(sizeof(MinStack));
    stack->node = NULL;
    return stack;
}

void minStackPush(MinStack* obj, int val) {
    Node* node = (Node*) malloc(sizeof(Node));
    node->val = val;

    if (obj->node == NULL || obj->node->min > val) {
        node->min = val;
    } else {
        node->min = obj->node->min;
    }

    node->next = obj->node;
    obj->node = node;
}

void minStackPop(MinStack* obj) {
    Node* temp = obj->node;
    obj->node = obj->node->next;
    free(temp);
}

int minStackTop(MinStack* obj) {
    return obj->node->val;
}

int minStackGetMin(MinStack* obj) {
    return obj->node->min;
}

void minStackFree(MinStack* obj) {
    while (obj->node != NULL) {
        Node* temp = obj->node;
        obj->node = obj->node->next;
        free(temp);
    }

    free(obj);
}

int main() {
    MinStack* stack = minStackCreate();
    minStackPush(stack, -2);
    minStackPush(stack, 0);
    minStackPush(stack, -1);

    assert(minStackGetMin(stack) == -2);
    assert(minStackTop(stack) == -1);

    minStackPop(stack);

    assert(minStackGetMin(stack) == -2);
}
