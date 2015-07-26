(ns stitchcounter-clj.stitchcounter
  (:gen-class))

(def cms-per-square 10.0)

(defn get-input [prompt]
  (println prompt)
  (read-line))

(defn get-number [prompt]
  (let [v (read-string (get-input prompt))]
    (if (number? v)
      v
      (do
        (println "Please specify a valid number.")
        (recur prompt)))))

(defn option-1 []
  (let [orows (get-number
               "Enter the number of rows in the original gauge:")
        osts (get-number
              "Enter the number of stitches of the original gauge:")
        rows (get-number "Enter the number of rows in your gauge:")
        sts (get-number "Enter the number of stitches in your gauge:")
        ovalr (get-number "Enter the total rows of the original project:")
        resr (float (/ (* rows ovalr) orows))
        ovals (get-number "Enter the stitches to CO in the project:")
        ress (float (/ (* sts ovals) osts))]
    (println "Final rows:" resr "/ Final stitches:" ress)))

(defn option-2 []
  (let [rows (get-number "Enter the number of your rows:")
        sts (get-number "Enter the number of your stitches:")
        rows1cm (/ rows cms-per-square)
        sts1cm (/ sts cms-per-square)
        cm (get-number "Enter the cms of your project:")
        resr (* rows1cm cm)
        ress (* sts1cm cm)]
    (println "Final rows:" resr "/ Final stitches:" ress)))

(defn stitchcounter []
  (println "Stitchcounter: useful tool to help knitting and crocheting")
  (println "Options:")
  (println "\t1 Calculate stitches from original gauge")
  (println "\t2 Calculate stitches from dimensions")
  (println "\t3 Quit")
  (let [input (get-input "Pick your option:")]
    (cond
      (= "1" input) (option-1)
      (= "2" input) (option-2)
      (= "3" input) (println "Quit")
      :else (do
              (println "Please specify a valid option.")
              (recur)))))

(defn -main [& args]
  (stitchcounter))
