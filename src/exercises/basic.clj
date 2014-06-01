(ns exercises.basic)

(def second-nth (fn [list] (nth list 1)))

(def third (fn [list] (nth list 2)))

(def third-lst (fn [list] (first (rest (rest list)))))
