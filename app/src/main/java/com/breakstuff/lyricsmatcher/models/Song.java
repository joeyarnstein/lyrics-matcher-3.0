package com.breakstuff.lyricsmatcher.models;

import org.parceler.Parcel;

/**
 * Created by AlinaAir on 7/12/16.
 */

@Parcel
public class Song {
    String song;
    String band;
    String album;
    String albumImg;
    String spotifyId;

    public Song() {}

    public Song (String song, String band, String album, String albumImg, String spotifyId){
        this.song = song;
        this.band = band;
        this.album = album;
        this.albumImg = albumImg;
        this.spotifyId = spotifyId;
    }

    public String getSong() {
        return song;
    }
    public String getBand() {
        return band;
    }
    public String getAlbum() {
        return album;
    }
    public String getImage() {
        return albumImg;
    }
    public String getSpotifyId() {
        return spotifyId;
    }

}
