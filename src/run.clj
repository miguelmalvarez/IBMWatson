(ns ibmwatson.run
	(:require [ibmwatson.news :as news]
			  [ibmwatson.text :as text]))


(def text "Clouded Leopards Born in Thailand Via Artificial Insemination. For only the second time, 
		   a litter of clouded leopard cubs has been born as the result of an artificial insemination. 
		   Pierre Comizzoli, reproductive physiologist at the Smithsonian Conservation Biology 
		   Institute (SCBI), performed the artificial insemination in Thailand last March alongside 
		   Paweena Thuwanut, a former JoGayle Howard Postdoctoral Fellow at SCBI, and Wanlaya Tipkantha, 
		   a doctoral candidate at Chulalongkorn University, who also studied at SCBI.

		   All this happened at the White House, where the President Barack Obaba was given a speech.")

(def query "IBM")

(println "TEXT")
(print (text.annotate text))


(println "NEWS")
(print (news.sample))
(print (news.positives query))
(print (news.negatives query))
