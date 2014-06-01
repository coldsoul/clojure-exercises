(ns exercises.basic)

(def second-nth (fn [list] (first (rest list))))

(def third (fn [list] (second (rest list))))

(def third-lst (fn [list] (first (rest (rest list)))))

(def square (fn [x] (* x x)))

(def add-squares
  (fn [& numbers]
    (apply + (map square numbers))))

(defn bizarre-factorial [number]
  (apply * (range 1 (+ number 1))))

(defn prefix-of? [candidate numbers]
  (= (take (count candidate) numbers) candidate))

(def tails
  (fn [seq]
    (map drop
       (range (inc (count seq)))
       (repeat (inc (count seq)) seq))))


