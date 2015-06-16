(ns ibmwatson.run
	(:require [ibmwatson.news :as news]
			  [ibmwatson.text :as text]
			  [clojure.edn :as edn]))

(def api_key (:api_key (edn/read-string (slurp "resources/config.edn"))))

(def text "Clouded Leopards Born in Thailand Via Artificial Insemination. For only the second time, 
		   a litter of clouded leopard cubs has been born as the result of an artificial insemination. 
		   Pierre Comizzoli, reproductive physiologist at the Smithsonian Conservation Biology 
		   Institute (SCBI), performed the artificial insemination in Thailand last March alongside 
		   Paweena Thuwanut, a former JoGayle Howard Postdoctoral Fellow at SCBI, and Wanlaya Tipkantha, 
		   a doctoral candidate at Chulalongkorn University, who also studied at SCBI.

		   All this happened at the White House, where the President Barack Obama was given a speech.")

(def query "Greece")

(println "TEXT")
(print (text/entities text api_key))
(print (text/entity-level-sentiment text api_key))

(println "NEWS")
(print (news/sample api_key))
(print (news/positives query 0.6 api_key))
(print (news/negatives query 0.6 api_key))