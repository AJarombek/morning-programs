// Main method for testing programs.
// Author: Andrew Jarombek
// Date: 2/3/2022

// I need to center my energy on people who are in my life.
// At this point I realize your answer is likely no as its been for 5 years,
// but I'd still love for you to be in my life again.
// There is no harm or shame in trying your best and realizing you need to do more work before trying again.
// But not trying is the same as moving backwards.  It doesn't give us a chance.
// I'm moving forward.  You are welcome to come along or lead the way.

use crate::length_of_last_word::length_of_last_word;
use crate::plus_one::plus_one;

mod length_of_last_word;
mod plus_one;

fn main() {
    assert_eq!(length_of_last_word(String::from("Hello world")), 5);
    assert_eq!(plus_one(vec![1, 2, 3]), vec![1, 2, 4])
}
