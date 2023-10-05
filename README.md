# product-graph
Title: Crafting Modern APIs with GraphQL

Introduction:

Welcome to our session on "Crafting Modern APIs with GraphQL," where we will embark on a journey to explore the power and versatility of GraphQL in shaping the future of API development. Whether you are a seasoned developer looking to level up your API game or just getting started in the world of APIs, this session will provide valuable insights and practical guidance.

During this session, we will delve into the following key topics:

Limitations of REST services and Why FB has created the graphql 

Understanding GraphQL: We'll begin by demystifying GraphQL, explaining its core concepts and how it differs from traditional RESTful APIs. You'll gain a clear understanding of GraphQL's query language and how it empowers clients to request exactly the data they need, reducing over-fetching and under-fetching.

Building GraphQL APIs: You'll learn how to design and build GraphQL APIs from scratch. We'll cover schema design, type definitions, resolvers, and the GraphQL SDL (Schema Definition Language). You'll see how GraphQL enables you to create APIs that are tailored to your specific application's data needs.

Data Querying and Mutations: We'll dive deep into querying data using GraphQL and explore its support for complex queries and nested data structures. Additionally, we'll discuss mutations, which allow you to modify data on the server side efficiently.

Real-world Use Cases: We'll showcase real-world use cases and examples of organizations that have successfully adopted GraphQL to address their API challenges. You'll discover how GraphQL has been embraced by tech giants and startups alike to enhance their API capabilities.

Challenges of the graphql 

By the end of this session, you'll have a solid understandings on foundation in GraphQL,


Limitations of 
GraphQL and REST are both popular approaches for building APIs, but they have different strengths and limitations. When discussing the limitations of REST services in the context of GraphQL, several key points come to mind:

1. Over-fetching and Under-fetching of Data:
   - In RESTful APIs, clients often receive fixed data structures defined by the server, which can lead to over-fetching (receiving more data than needed) or under-fetching (not getting enough data) issues. Clients may need to make multiple requests to different endpoints to assemble the necessary data.


2. Multiple Endpoints and Versioning:
   - REST APIs often require multiple endpoints for different resources or actions, and evolving these APIs often necessitates versioning to maintain backward compatibility. This can lead to complex routing and maintenance challenges.


3. Underutilized Data:
   - In REST, endpoints typically return a fixed set of fields, even if the client needs only a subset of those fields. This leads to unnecessary data transfer, especially in mobile or low-bandwidth scenarios.


4. Lack of Strong Typing:
   - REST APIs often lack strong typing, meaning clients need to rely on documentation or conventions to understand the data structure and available operations.

5. Overhead of Multiple Requests:
   - RESTful clients may need to make multiple requests to different endpoints to gather related data, leading to increased latency and overhead.


