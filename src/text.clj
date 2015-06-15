(ns ibmwatson.news
	(:require [clj-http.client :as client]))  	

(def api_key "c660d29868a62f95066894851a65e8f2cbcf8256")
(def root_url "http://access.alchemyapi.com/calls/text/TextGetRankedNamedEntities")

(def text "Clouded Leopards Born in Thailand Via Artificial Insemination. For only the second time, 
		   a litter of clouded leopard cubs has been born as the result of an artificial insemination. 
		   Pierre Comizzoli, reproductive physiologist at the Smithsonian Conservation Biology 
		   Institute (SCBI), performed the artificial insemination in Thailand last March alongside 
		   Paweena Thuwanut, a former JoGayle Howard Postdoctoral Fellow at SCBI, and Wanlaya Tipkantha, 
		   a doctoral candidate at Chulalongkorn University, who also studied at SCBI.

		   All this happened at the White House, where the President Barack Obaba was given a speech.")

(defn sample 
	[]
	(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"
										 "disambiguated" 1}}))

