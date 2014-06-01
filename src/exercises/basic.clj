(ns exercises.basic)

(def second-nth (fn [list] (first (rest list))))

(def third (fn [list] (second (rest list))))

(def third-lst (fn [list] (first (rest (rest list)))))

(def square (fn [x] (* x x)))

(def add-squares
  (fn [& numbers]
    (apply + (map square numbers))))
