// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan18",
    products: [
        .library(
            name: "mpJan18",
            targets: ["mpJan18"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan18",
            dependencies: []),
        .testTarget(
            name: "mpJan18Tests",
            dependencies: ["mpJan18"]),
    ]
)
