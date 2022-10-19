// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct19",
    products: [
        .library(
            name: "mpOct19",
            targets: ["mpOct19"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct19",
            dependencies: []),
        .testTarget(
            name: "mpOct19Tests",
            dependencies: ["mpOct19"]),
    ]
)
