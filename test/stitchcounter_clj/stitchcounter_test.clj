(ns stitchcounter-clj.stitchcounter-test
  (:require [clojure.test :refer :all]
            [stitchcounter-clj.stitchcounter :refer :all]))

(deftest test-input []
  (testing "Test reading user input."
    (is (= "OK" (get-input "Insert OK:")))))

(deftest test-input-number []
  (testing "Test reading number from user input."
    (is (= 10 (get-number "Insert 10: ")))))
