RGSRC=../..
include $(RGSRC)/envir.mak

SUBDIRS+=$(if $(CONFIG_ARCH_IXP425), mi424wr)

ifndef CONFIG_RG_GPL
ifdef CONFIG_FOR_QWEST
  FACTORY_SETTINGS=factory_settings_qwest.c
else
  FACTORY_SETTINGS=factory_settings.c
endif

EXPORT_HEADERS_DIR=vendor

ifdef CONFIG_RG_VENDOR_FACTORY_SETTINGS
  EXPORT_HEADERS+=$(FACTORY_SETTINGS)__c/factory_settings.c
  CD_EXPORTED_FILES=factory_settings.c factory_settings_qwest.c
endif

ifdef CONFIG_RG_UIEVENTS
  EXPORT_HEADERS+=uievents.c__c/uievents.c 
endif
endif

include $(RGMK)
