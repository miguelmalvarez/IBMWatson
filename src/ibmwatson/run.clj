(ns ibmwatson.run
	(:require [ibmwatson.news :as news]
			  [ibmwatson.text :as text]
			  [clojure.edn :as edn]))

(def api_key (:api_key (edn/read-string (slurp "resources/config.edn"))))

(def text 
	"Donald Trump announced that he is going to run for the Republican party's presidential")

(def query "Greece")

(println "TEXT")
(print (text/entities text api_key))
(print (text/entity-level-sentiment text api_key))
(print (text/relations text api_key))
(print (text/taxonomy text api_key))
(print (text/concepts text api_key))

(println "NEWS")
; (print (news/sample api_key))
; (print (news/positives query 0.6 api_key))
; (print (news/negatives query 0.6 api_key))