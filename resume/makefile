LC = xelatex
LFLAGS = -output-directory=$(OUT)
OUT = output
MV = mv

MAIN = resume
TEX = $(MAIN).tex
PDF = $(MAIN).pdf
AUX = $(OUT)/$(MAIN).aux
DVI = $(OUT)/$(MAIN).dvi
LOG = $(OUT)/$(MAIN).log


$(MAIN): $(TEX)
	$(LC) $(LFLAGS) $(TEX)
	$(MV) $(OUT)/$(PDF) $(PDF)

clean:
	$(RM) $(AUX) $(PDF) $(DVI) $(LOG)
