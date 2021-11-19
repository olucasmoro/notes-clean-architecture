package com.olucasmoro.noteappcleanarchitecture.feature_note.presentation.add_edit_note

data class NoteTexFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)