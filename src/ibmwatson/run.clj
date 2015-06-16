(ns ibmwatson.run
	(:require [ibmwatson.news :as news]
			  [ibmwatson.text :as text]
			  [clojure.edn :as edn]))

(def api_key (:api_key (edn/read-string (slurp "resources/config.edn"))))

(def text "Dick Costolo: Search for new Twitter CEO is legitimate
		   Dick Costolo is stepping down as Twitter CEO on July 1 but that didn’t 
		   stop him from publicly discussing the company onstage at Bloomberg’s 
		   tech conference in San Francisco on Tuesday. He also dispelled the notion 
		   that Twitter's board had already decided cofounder Jack Dorsey will be his 
		   permanent successor.")

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