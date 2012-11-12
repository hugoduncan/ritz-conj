(ns ritz-conj.example)

;;; simple exception

(comment (/ 1 0))

(defn f1 []
  (let [a 1]
    (/ a 0)))

(comment (f1))

;; (defn f2 []
;;   (let [a (map inc (range 1000))]
;;     (/ (first a) 0)))

;; (comment (f2))

;; ;;; Lazy sequences
;; (defn f3 []
;;   (let [a (range 10000)]
;;     (/ (first a) 0)))

;; (comment (f3))


;;; Locals clearing
;; (defn f4 []
;;   (let [b (range 10)
;;         c (map inc b)]
;;     (f1)))

;; (comment (f4))

(defn f5 []
  (let [c (range 10)]
    (/ (first c) 0)))

(comment (f5))


;;; Tracking down errors
(comment
  (defmulti fred [x] x))

(comment
  (ns fred
    (:use
     [clojure.string :only join])))
