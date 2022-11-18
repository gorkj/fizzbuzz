(ns fizzbuzz
  (:require [clojure.core.match :refer [match]]))

(doseq [i (range 1 101)]
  (println
   (match [(mod i 3) (mod i 5)]
          [0 0] "FizzBuzz"
          [0 _] "Fizz"
          [_ 0] "Buzz"
          :else i)))
