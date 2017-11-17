(ns test-check.summary.core-test
  (:require [cljs.spec.test.alpha :as stest]
            [test-check.summary.core])
  (:require-macros [cljs.spec.test.alpha :as stest]))

(stest/summarize-results (stest/check 'test-check.summary.core))
