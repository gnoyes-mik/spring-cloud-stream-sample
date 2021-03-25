package me.gnoyes.msgproducer2;

public class MessageDto {
    private String author;
    private String contents;

    MessageDto() {
    }

    MessageDto(String author, String contents) {
        this.author = author;
        this.contents = contents;
    }

    public String getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }
}
