// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct16",
    products: [
        .library(
            name: "mpOct16",
            targets: ["mpOct16"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct16",
            dependencies: []),
        .testTarget(
            name: "mpOct16Tests",
            dependencies: ["mpOct16"]),
    ]
)
