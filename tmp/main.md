# Car Part Defect Detection with ResNet

This README explains a workflow for detecting defects in car parts using a ResNet model.

## Flowchart

Here's a flowchart illustrating the process:

```mermaid
graph LR
    A[Start] --> B(Data Acquisition)
    B --> C[Data Preprocessing]
    C --> D[Data Split (Train/Validation/Test)]
    D --> E(Load Pretrained ResNet)
    E --> F(Fine-tune ResNet)
    F --> G[Model Training]
    G --> H[Model Evaluation on Validation Set]
    H -- Satisfactory --> I(Model Testing on Test Set)
    H -- Not Satisfactory --> F
    I --> J[Defect Detection (Inference)]
    J --> K[Output: Defect Location and Type]
    K --> L[End]


    style A fill:#f9f,stroke:#333,stroke-width:2px
    style L fill:#f9f,stroke:#333,stroke-width:2px
    style E fill:#ccf,stroke:#333,stroke-width:2px
    style F fill:#ccf,stroke:#333,stroke-width:2px
    style G fill:#ccf,stroke:#333,stroke-width:2px
    style I fill:#ccf,stroke:#333,stroke-width:2px
    style J fill:#ccf,stroke:#333,stroke-width:2px
    style K fill:#ccf,stroke:#333,stroke-width:2px
    style C fill:#aaf,stroke:#333,stroke-width:2px
    style D fill:#aaf,stroke:#333,stroke-width:2px
    style B fill:#aaf,stroke:#333,stroke-width:2px
    style H fill:#aaf,stroke:#333,stroke-width:2px
