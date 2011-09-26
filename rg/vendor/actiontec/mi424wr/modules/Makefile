RGSRC=../../../..
include $(RGSRC)/envir.mak

# mi424wr.o - generic board support (must be statically linked to kernel)
MOD_TARGET=aei_ixp4xx.o
MOD_2_STAT=$(MOD_TARGET)
O_OBJS_aei_ixp4xx.o+=arch.o latch.o

ifdef CONFIG_PCI
  O_OBJS_aei_ixp4xx.o+=$(if $(CONFIG_ARCH_IXP425_RI408), ri408_pci.o)
  O_OBJS_aei_ixp4xx.o+=$(if $(CONFIG_ARCH_IXP425_MI424WR), pci.o)
endif

JPKG_EXPORTED_FILES+=$(if $(CONFIG_RG_JPKG_SRC), pci.c ri408_pci.c)

EXPORT_HEADERS_DIR=vendor
ifndef CONFIG_RG_GPL
EXPORT_HEADERS+=plf_leds.h plf_leds.c__c/plf_leds.c spi.h 
endif
EXPORT_HEADERS+=arch.h  latch.h

include $(RGMK)
