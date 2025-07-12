#Author: Juan
  #Language: en

Feature: Calificación de eventos por usuarios autenticados
    Como usuario autenticado
    Quiero calificar un evento con una calificación numérica de 1 a 5
    Para expresar mi nivel de satisfacción

    Scenario: Usuario califica un evento con una calificación válida
      Given el usuario ha iniciado sesión correctamente
      When el usuario selecciona una calificación entre 1 y 5 para un evento
      Then la calificación se asocia al usuario y al evento
      And se muestra el usuario que calificó y hace cuánto fue publicada la calificación
