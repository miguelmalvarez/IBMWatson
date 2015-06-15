(ns ibmwatson.news
	(:require [clj-http.client :as client]))  	

(def api_key "c660d29868a62f95066894851a65e8f2cbcf8256")
(def root_url "https://access.alchemyapi.com/calls/data/GetNews")


(defn sample 
	[]
	(client/get root_url {:query-params {"apikey" api_key
										 "outputMode" "json" 
										 "start" "now-1d"
										 "end" "now"
										 "maxResults" 5
										 "return" "original"}}))