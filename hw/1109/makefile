JFLAGS=-g
JC=javac
NAME=milliStrTime06

default: debug

perfect: run

$(NAME).class: $(NAME).java
	$(JC) $(JFLAGS) $(NAME).java

run: $(NAME).class
	java $(NAME)

debug: run
	date +%H:%M:%S
	date +%s

clean:
	rm *.class
