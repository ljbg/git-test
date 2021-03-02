package com.lijunbo.domain;


import java.util.Date;

public class Movies {

    private Integer moviesId;
    private String moviesName;
    private String moviesImg;
    private Date moviesDate;
    private Types moviesType;

    public Integer getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Integer moviesId) {
        this.moviesId = moviesId;
    }

    public String getMoviesName() {
        return moviesName;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    public String getMoviesImg() {
        return moviesImg;
    }

    public void setMoviesImg(String moviesImg) {
        this.moviesImg = moviesImg;
    }

    public Date getMoviesDate() {
        return moviesDate;
    }

    public void setMoviesDate(Date moviesDate) {
        this.moviesDate = moviesDate;
    }

    public Types getMoviesType() {
        return moviesType;
    }

    public void setMoviesType(Types moviesType) {
        this.moviesType = moviesType;
    }
}
