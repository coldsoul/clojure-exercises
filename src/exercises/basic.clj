(ns exercises.basic)

(def second-nth (fn [list] (second list)))

(def third (fn [list] (second (rest list))))

(def third-lst (fn [list] (first (rest (rest list)))))
