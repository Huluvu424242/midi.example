package com.github.funthomas424242.midi.sounds.simple;

import jm.constants.ProgramChanges;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.View;

import static jm.constants.Durations.HALF_NOTE;
import static jm.constants.Durations.QUARTER_NOTE;
import static jm.constants.Durations.WHOLE_NOTE;
import static jm.constants.Pitches.*;

public class SummBienchenSumm {


    public static void main(String[] args) {

        final Part part = new Part("Part Beschreibung", ProgramChanges.PIANO);
        part.add(getPhrase1());
        part.add(getPhrase2());
        part.add(getPhrase1());
        View.notate(part);

//        final Score score = new Score("Summ Bienchen Summ");
//        score.setTempo(100.0);
//        View.notate(part);
        //QTPlayer.display(score);
    }

    private static Phrase getPhrase1() {
        final Phrase phrase = new Phrase("Summ summ summ, Bienchen summ herum",0.0, ProgramChanges.PIANO,true);
        phrase.setRhythmValue(110.0);
        //phrase.setDuration();

        phrase.addNote(new Note(G4, HALF_NOTE));
        phrase.addNote(new Note(F4, HALF_NOTE));
        //
        phrase.addNote(new Note(E4, WHOLE_NOTE));
        //
        phrase.addNote(new Note(D4, QUARTER_NOTE));
        phrase.addNote(new Note(E4, QUARTER_NOTE));
        phrase.addNote(new Note(F4, QUARTER_NOTE));
        phrase.addNote(new Note(D4, QUARTER_NOTE));
        //
        phrase.addNote(new Note(C4, WHOLE_NOTE));
        return phrase;
    }

    private static Phrase getPhrase2() {
        final Phrase phrase = new Phrase("Ei wir tun die nichts zu leide, flieg nur aus in Wald und Heide");
        phrase.setRhythmValue(110.0);
        //phrase.setDuration();

        phrase.addNote(new Note(E4, QUARTER_NOTE));
        phrase.addNote(new Note(F4, QUARTER_NOTE));
        phrase.addNote(new Note(G4, QUARTER_NOTE));
        phrase.addNote(new Note(E4, QUARTER_NOTE));
        //
        phrase.addNote(new Note(D4, QUARTER_NOTE));
        phrase.addNote(new Note(E4, QUARTER_NOTE));
        phrase.addNote(new Note(F4, QUARTER_NOTE));
        phrase.addNote(new Note(D4, QUARTER_NOTE));
        //
        phrase.addNote(new Note(E4, QUARTER_NOTE));
        phrase.addNote(new Note(F4, QUARTER_NOTE));
        phrase.addNote(new Note(G4, QUARTER_NOTE));
        phrase.addNote(new Note(E4, QUARTER_NOTE));
        //
        phrase.addNote(new Note(D4, QUARTER_NOTE));
        phrase.addNote(new Note(E4, QUARTER_NOTE));
        phrase.addNote(new Note(F4, QUARTER_NOTE));
        phrase.addNote(new Note(D4, QUARTER_NOTE));
        return phrase;
    }



}