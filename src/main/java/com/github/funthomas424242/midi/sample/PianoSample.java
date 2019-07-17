package com.github.funthomas424242.midi.sample;

import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.music.tools.Mod;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;

import static jm.constants.Durations.SQ;
import static jm.constants.Pitches.*;
import static jm.constants.Pitches.CS5;
import static jm.constants.ProgramChanges.PIANO;

public class PianoSample {


    public static void main(String[] args) {

        final PianoSample main = new PianoSample();
        main.play();
    }


    protected void play() {
        Score score = new Score("Piano Phase", 120.0);
        Part p1 = new Part("Piano1", PIANO, 0);
        Part p2 = new Part("Piano2", PIANO, 1);
        Phrase phrase1 = new Phrase(0.0);
        //Lets write the music in a convenient way.
        int[] pitchArray = {E4, FS4, B4, CS5, D5, FS4, E4, CS5, B4, FS4, D5, CS5};
        double[] rhythmArray = {SQ, SQ, SQ, SQ, SQ, SQ, SQ, SQ, SQ, SQ, SQ, SQ};
        //add the notes to the first phrase
        phrase1.addNoteList(pitchArray, rhythmArray);
        // repeat the stable piano part and add it to a part and score
        Mod.repeat(phrase1, 52);
        p1.addPhrase(phrase1);
        score.addPart(p1);
        //Make two new phrases and change starttimes to make a round
        Phrase phrase2 = (Phrase) phrase1.copy();
        phrase2.setStartTime(0.0);
        // Phrase 3 is the one which extends phrase two at a different tempo
        for (int i = 1; i < rhythmArray.length; i++) {
            rhythmArray[i] = rhythmArray[i] * 0.975;
        }
        Phrase phrase3 = new Phrase(0.0);
        phrase3.addNoteList(pitchArray, rhythmArray);
        phrase3.setStartTime(24.0);
        //Phrse four is played after the offset period
        Phrase phrase4 = (Phrase) phrase1.copy();
        phrase4.setStartTime(141.0);
        //one beat short of the start of bar 13
        //Play different parts in different octaves for more audible clarity
        Mod.transpose(phrase2, 12);
        Mod.transpose(phrase3, 12);
        Mod.transpose(phrase4, 12);
        //loop phrases
        Mod.repeat(phrase2, 7);
        // stable
        Mod.repeat(phrase3, 30);
        // accellerated
        Mod.repeat(phrase4, 7);
        //stable again
        //add phrases to the two instruments
        p1.addPhrase(phrase1);
        p2.addPhrase(phrase2);
        p2.addPhrase(phrase3);
        p2.addPhrase(phrase4);
        //add second piano instrument to the score
        //score.addPart(p2);
        //OK now we SMF write
        Write.midi(score, "PianoPhase.mid");
        View.notate(score);
        Play.midi(score, true);
    }


}
