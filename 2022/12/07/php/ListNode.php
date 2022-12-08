<?php

/**
 * ListNode class representing a node in a linked list data structure.
 * @author Andrew Jarombek
 * @since 12/7/2022
 */

class ListNode
{
    public mixed $val = 0;
    public mixed $next = null;

    function __construct($val = 0, $next = null) {
        $this->val = $val;
        $this->next = $next;
    }
}