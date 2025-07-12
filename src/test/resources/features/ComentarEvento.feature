Feature: Comentarios en eventos por usuarios autenticados
  Como usuario autenticado
  Quiero comentar un evento para compartir mi experiencia

  Scenario: Usuario publica un comentario sin estar autenticado
    Given que el usuario no ha iniciado sesión correctamente
    When el usuario intenta escribir un comentario
    Then el comentario no se publica

  Scenario: Usuario publica un comentario vacio
    Given que el usuario ha iniciado sesión correctamente
    When el usuario escribe un comentario vacio
    Then el comentario vacio no se publica

  Scenario: Usuario publica un comentario válido
    Given que el usuario ha iniciado sesión correctamente
    When el usuario escribe un comentario valido
    Then el comentario se muestra inmediatamente en el listado







