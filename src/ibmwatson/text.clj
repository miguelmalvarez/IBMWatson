(ns ibmwatson.text
	(:require [clj-http.client :as client]))  	

(def api_key "c660d29868a62f95066894851a65e8f2cbcf8256")
(def root_url "http://access.alchemyapi.com/calls/text/TextGetRankedNamedEntities")

(defn annotate
	[text]
	(client/get root_url {:query-params {"apikey" api_key
										 "text" text
										 "outputMode" "json"
										 "disambiguated" 1}}))

