(ns exercises.tests-basic
  (:use midje.sweet)
  (:require [exercises.basic :as basic]))

(fact "second-nth returns the second element of a list"
      (basic/second-nth '(1 2 3 4)) => 2
      (basic/second-nth '(2 3 4)) => 3
      (basic/second-nth '(2)) => nil)

(fact "third returns the third element of a list"
      (basic/third '(1 2 3 4 5)) => 3
      (basic/third '(1 2)) => nil)

(fact "third-lst returns the third element of a list"
      (basic/third-lst '(1 2 3 4 5)) => 3
      (basic/third-lst '(2 3)) => nil)

(fact "add-squares adds the squares of numbers provided as arguments"
      (basic/add-squares 1 2) => 5)

(fact "bizarre-factorial finds factorial without iteration or recursion"
      (basic/bizarre-factorial 3) => 6)

(fact "prefix-of? checks if first seq are the first element of the sequence passed"
      (basic/prefix-of? [1 2] [1 2 3 4]) => true
      (basic/prefix-of? [1] [1 2 3]) => true
      (basic/prefix-of? [1 2] [4 5 6]) => false)
