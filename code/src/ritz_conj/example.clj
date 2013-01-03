(ns ritz-conj.example)

;;; simple exception
(comment
  (/ 1 0))

(defn divide-by-zero []
  (let [a 1]
    (/ a 0)))

(comment
  (divide-by-zero))


;;; locals clearing
(defn local-lazy-seq []
  (let [c (range 10)]
    (/ (first c) 0)))

(comment
  (local-lazy-seq))


;;; Tracking down errors
(comment
  (defmulti fred [x] x))

(comment
  (ns fred
    (:use
     [clojure.string :only join])))
