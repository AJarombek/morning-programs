// swift-tools-version: 5.8

import PackageDescription

let package = Package(
    name: "morning_programs",
    products: [
        .library(
            name: "mp",
            targets: ["mp"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mp",
            dependencies: []),
        .testTarget(
            name: "mpTests",
            dependencies: ["mp"]),
    ]
)
