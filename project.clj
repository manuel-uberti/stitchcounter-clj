(defproject stitchcounter-clj "0.1.0-SNAPSHOT"
  :description "Command line tool to help you with knitting and crocheting"
  :url "http://github.com/manuel-uberti/stitchcounter-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [acyclic/squiggly-clojure "0.1.2-SNAPSHOT"]]
  :main stitchcounter-clj.stitchcounter
  :bin {:name "stitch-counter"}
  :plugins [[lein-environ "1.0.0"]
            [lein-bin "0.3.4"]]

  ;; Configuration here may be overridden by namespace metadata.
  :profiles {:dev {:env {:squiggly {:checkers [:eastwood]
                                    :eastwood-exclude-linters [:unlimited-use]}}}})
