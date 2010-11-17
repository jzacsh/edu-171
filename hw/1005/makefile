JFLAGS=-g
JC=javac
NAME=interest

default: run

run: $(NAME).class
	java $(NAME) gui

$(NAME).class: $(NAME).java
	$(JC) $(JFLAGS) $(NAME).java

clean:
	rm *.class
