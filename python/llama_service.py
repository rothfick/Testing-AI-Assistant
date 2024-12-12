from transformers import pipeline

# Inicjalizacja modelu
generator = pipeline('text-generation', model='meta-llama/Llama-2-7b')

# Funkcja generowania tekstu
def generate_text(prompt):
    result = generator(prompt, max_length=200, num_return_sequences=1)
    return result[0]['generated_text']

if __name__ == "__main__":
    print(generate_text("Hello, AI assistant!"))
