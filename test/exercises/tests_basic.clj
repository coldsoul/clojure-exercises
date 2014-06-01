(ns exercises.tests-basic
  (:use midje.sweet)
  (:require [exercises.basic :as basic]))

(fact "second-nth returns the second element of a list"
      (basic/second-nth '(1 2 3 4)) => 2
      (basic/second-nth '(2 3 4)) => 3)

(fact "third returns the third element of a list"
      (basic/third '(1 2 3 4 5)) => 3)

(fact "third-lst returns the third element of a list"
      (basic/third-lst '(1 2 3 4 5)) => 3)