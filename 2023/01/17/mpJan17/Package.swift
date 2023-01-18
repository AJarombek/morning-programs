// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan17",
    products: [
        .library(
            name: "mpJan17",
            targets: ["mpJan17"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan17",
            dependencies: []),
        .testTarget(
            name: "mpJan17Tests",
            dependencies: ["mpJan17"]),
    ]
)
