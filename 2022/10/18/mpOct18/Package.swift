// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct18",
    products: [
        .library(
            name: "mpOct18",
            targets: ["mpOct18"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct18",
            dependencies: []),
        .testTarget(
            name: "mpOct18Tests",
            dependencies: ["mpOct18"]),
    ]
)
