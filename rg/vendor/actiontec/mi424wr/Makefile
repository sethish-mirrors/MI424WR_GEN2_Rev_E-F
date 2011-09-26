RGSRC=../../..
include $(RGSRC)/envir.mak

SUBDIRS+=modules

ifndef CONFIG_RG_GPL
EXPORT_HEADERS_DIR=vendor
EXPORT_HEADERS+=flash_layout.c__c/flash_layout.c
endif

include $(RGMK)
