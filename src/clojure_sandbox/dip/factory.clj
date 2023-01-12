(ns sandbox.dip.factory)

(defprotocol Factory
  (create-interface [this]))
