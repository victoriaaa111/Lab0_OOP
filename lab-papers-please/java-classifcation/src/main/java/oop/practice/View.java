package oop.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class View {

    public void printToJson(String universeName, List<IndividualTraits> individuals, String outputPath) {
        UniverseRecords output = new UniverseRecords(universeName, individuals);
        String formattedJson = generateFormattedJson(output);

        // write formatted json to file
        try (FileWriter fileWriter = new FileWriter(outputPath)) {
            fileWriter.write(formattedJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // format json
    private String generateFormattedJson(UniverseRecords output) {
        StringBuilder jsonBuilder = new StringBuilder();

        jsonBuilder.append("{\n");
        jsonBuilder.append("  \"name\": \"").append(output.getName()).append("\",\n");
        jsonBuilder.append("  \"individuals\": [\n");

        for (IndividualTraits individual : output.getIndividuals()) {
            jsonBuilder.append("    {\n");
            jsonBuilder.append("      \"id\": ").append(individual.getId()).append(",\n");
            jsonBuilder.append("      \"isHumanoid\": ").append(individual.getIsHumanoid());

            if (individual.getPlanet() != null) {
                jsonBuilder.append(",\n      \"planet\": \"").append(individual.getPlanet()).append("\"");
            }

            if (individual.getAge() != 0) {
                jsonBuilder.append(",\n      \"age\": ").append(individual.getAge());
            }

            // print traits if the list is not empty
            if (individual.getTraits() != null && !individual.getTraits().isEmpty()) {
                jsonBuilder.append(",\n      \"traits\": [\n");
                for (int j = 0; j < individual.getTraits().size(); j++) {
                    jsonBuilder.append("        \"").append(individual.getTraits().get(j)).append("\"");
                    if (j < individual.getTraits().size() - 1) {
                        jsonBuilder.append(",");
                    }
                    jsonBuilder.append("\n");
                }
                jsonBuilder.append("      ]");
            }

            jsonBuilder.append("\n    }");

            // add comma after each indiv, except last
            if (individual != output.getIndividuals().getLast()) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\n");
        }


        jsonBuilder.append("  ]\n");
        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }

    // class represents the universe output
    private static class UniverseRecords {
        private final String name;
        private final List<IndividualTraits> individuals;

        public UniverseRecords(String name, List<IndividualTraits> individuals) {
            this.name = name;
            this.individuals = individuals;
        }

        public String getName() {
            return name;
        }

        public List<IndividualTraits> getIndividuals() {
            return individuals;
        }
    }
}
