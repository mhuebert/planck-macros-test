(ns planck-macros-test.core
  (:require-macros [planck-macros-test.common :refer [add-clj]])
  (:require
    [planck-macros-test.common

     ;:refer-macros [add-regular]       ;;works

     :refer-macros [add-regular add-clj]       ;;problematic

     ;Error:
     ;Could not parse ns form planck-macros-test.core in file .../planck-macros-test/src/planck_macros_test/common.cljc
     ;Invalid :refer, macro planck-macros-test.common/add-clj does not exist in file .../planck-macros-test/src/planck_macros_test/common.cljc
     ]))

(enable-console-print!)

(prn (add-regular 1 2))
(prn (add-clj 1 2))



