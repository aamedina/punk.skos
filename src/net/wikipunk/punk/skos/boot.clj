(ns net.wikipunk.punk.skos.boot
  {:rdf/type :jsonld/Context})

(def punk.skos
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/skos/"
   :rdfa/prefix "punk.skos"})
