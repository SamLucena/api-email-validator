# api-email-validator

Uma api em springboot que realiza a validação do email de usuários.

## URL requisição

- POST: ``https://email-validator.up.railway.app/api/v1/validate``

## Corpo da Requisição
```json
{
  "email": joedoe@example.com
}
```

## Error - Resposta da requisição
```json
{
    "message": "Email is not valid",
    "path": "/api/v1/validate",
    "timestamp": "2023-05-17T03:26:08.359966012Z",
    "valid": false
}
```

## Success - Resposta da requisição
```json
{
    "email": joedoe@example.com,
    "valid": true
}
```

CI/CD no RailWay: [API-EMAIL-VALIDATOR](https://email-validator.up.railway.app/api/v1/joedoe@example.com)

