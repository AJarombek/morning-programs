// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan11",
    products: [
        .library(
            name: "mpJan11",
            targets: ["mpJan11"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan11",
            dependencies: []),
        .testTarget(
            name: "mpJan11Tests",
            dependencies: ["mpJan11"]),
    ]
)
