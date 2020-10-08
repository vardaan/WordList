package com.example.jetpackcodelab

import com.example.jetpackcodelab.model.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords = wordDao.getAlphabeticalWords()

     suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}