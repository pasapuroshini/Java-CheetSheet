# Reference for formulas:
```
// Write encrypted message to a file
        try (FileWriter writer = new FileWriter("encrypted_data.txt")) {
            writer.write(encryptedMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the encrypted message from file
        StringBuilder readEncrypted = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("encrypted_data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                readEncrypted.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

```

        List<Pipe> result = pipes.stream()
            .filter(p -> p.diameter > 10)
            .sorted(Comparator.comparingDouble(p -> p.flowRate))
            .collect(Collectors.toList());

```
